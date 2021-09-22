package example.quickstart.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import example.quickstart.model.FileDetails;
import example.quickstart.model.FileModel;

@Controller
@RequestMapping("/file")
public class FileController extends AbstractController {

	@GetMapping(value = "/name")
	public String getfiledetails(@PathVariable Optional<Long> id, Model model) {
		model.addAttribute("filedetail", new FileDetails());
		return "file";
	}

	@PostMapping("/addFile/{id}")
	public String createNewFile(@RequestParam("file") MultipartFile file, @PathVariable Long id,
			RedirectAttributes attributes) throws IOException {
		return "redirect:../" + id;
	}

	@GetMapping("/deleteFile")
	public String deleteFile(@RequestParam("fileId") Long fileId, RedirectAttributes attributes) throws IOException {
		return "redirect:../inventorySource/" + fileId;
	}

	@GetMapping("/viewFile/{id}")
	public String viewFile(@PathVariable String id, HttpServletResponse response) throws IOException {
		File file = new File(id);
		response.addHeader("Content-disposition", "attachment;filename=" + file.getName());
		response.setContentType(file.getCanonicalPath());
		response.flushBuffer();
		return null;
	}

	public String fileMetadata(@RequestParam Map<String, String> metaparams, @PathVariable Long id, Model model,
			RedirectAttributes attributes) {
		return "redirect:/file" + id;
	}

	@ModelAttribute
	protected void buildModel(Model model) {
		FileModel pageModel = new FileModel();
		model.addAttribute("pageModel", pageModel);
	}
}
