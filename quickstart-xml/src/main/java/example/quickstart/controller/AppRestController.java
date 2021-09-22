package example.quickstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import example.quickstart.entity.Account;
import example.quickstart.entity.Address;
import example.quickstart.exceptions.ResourceNotFoundException;
import example.quickstart.model.AccountColletion;
import example.quickstart.repository.AccountRepository;
import example.quickstart.service.AppService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/app")
public class AppRestController {

    @Autowired
    private AppService appService;

    private AccountRepository accountRepository;

    /**
     * Get Account Details using Path variable
     * 
     * @param accountNo
     * @return
     */
    @GetMapping(value = "/{accountNo}")
    public String getAccount(@PathVariable("accountNo") Long accountNo) {
	return appService.getAppStatus(accountNo);
    }

    /**
     * Get List of Accounts using Request Body.
     * 
     * @param accountColletion
     * @return
     */
    @GetMapping(value = "/allaccounts")
    @ResponseBody
    public List<Account> getAccountDetails(@RequestBody AccountColletion accountColletion) {
	return appService.getAccounts(accountColletion);
    }

    /**
     * Get Account Details Using Request parameter.
     * 
     * @param accountNo
     * @return
     */
    @GetMapping(value = "/account")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String getAccountRequestParam(@RequestParam("id") Long accountNo) {
	return appService.getAppStatus(accountNo);
    }

    /**
     * Create new Account Record.
     * 
     * @param Account Related Information as request Body.
     * @return
     */
    @PostMapping(value = "/add", consumes = { "application/json", "application/xml" }, produces = { "application/json",
	    "application/xml" })
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a new  resource.", notes = "Returns the URL of the new resource in the Location header.")
    public String createRecord() {
	return appService.getCreateAppRecord();
    }

    /**
     * Get Account Details Using Request parameter. Sending Response Entity Object.
     * 
     * @param accountNo
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Account>> index(@RequestParam(value = "radius") int accountNo) {
	List<Account> accounts = accountRepository.findByRadius(accountNo);

	return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    /**
     * Create new Account Record.
     * 
     * @param Account Related Information as request Body.
     * @return
     */

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Account> createNewAccount(@RequestBody Account account) {
	if (null == account.getAddress()) {
	    account.setAddress(new Address());
	}

	accountRepository.add(account);

	return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    /**
     * Delete Existing Account Record.
     * 
     * @param Account Related Information as request Body.
     * @return
     */
    @RequestMapping(value = "{personId}", method = RequestMethod.DELETE)
    public ResponseEntity<Account> deleteAccount(@PathVariable String personId) {
	if (null == accountRepository.findById(personId)) {
	    throw new ResourceNotFoundException();
	}

	Account account = accountRepository.delete(personId);

	return new ResponseEntity<>(account, HttpStatus.OK);
    }

    /**
     * Get Account address related information.
     * 
     * @param Account Related Information as request Body.
     * @return
     */
    @RequestMapping(value = "{accountNo}/address", method = RequestMethod.GET)
    public ResponseEntity<Address> getAccountAddress(@PathVariable String accountNo) {
	Account p = accountRepository.findById(accountNo);
	if (null == p) {
	    throw new ResourceNotFoundException();
	}

	return new ResponseEntity<>(p.getAddress(), HttpStatus.OK);
    }

}
