package example.quickstart.misc.matcher;

public class Facade {
	private final Decorator decorator;
	private final PrinterService printerService;

	public Facade(Decorator decorator, PrinterService printerService) {
		this.decorator = decorator;
		this.printerService = printerService;
	}

	public void process(String object) {
		printerService.print(decorator.decorate(object));
	}

}
