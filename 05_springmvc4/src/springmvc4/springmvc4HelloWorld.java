package springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springmvc4HelloWorld {
	@RequestMapping("/welcome")
		public ModelAndView helloWorld() {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
			return new ModelAndView("welcome", "message", message);
}

	@RequestMapping("/adios")
	public ModelAndView adios() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hasta luego Maricarmen</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("adios", "message", message);
}
}
