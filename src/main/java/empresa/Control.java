package empresa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {

		@Autowired
		private ColaboradoresRepository repoCol;
		private SetoresRepository repoSetor;
		
		@PostMapping(value= "/colaborador-insert", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
		public ModelAndView save(@RequestParam String cpf, @RequestParam String nome, @RequestParam String telefone, @RequestParam String email, @RequestParam String descricao) {
			ModelAndView mv = new ModelAndView("index");
			try {
				Colaboradores c = new Colaboradores(null, cpf,nome,telefone,email);
				repoCol.save(c);
				Setores s = new Setores();
				s.setColaboradores(c);
				repoSetor.save(s);
				mv.addObject("msg","Data created...");
			} catch (Exception e) {
				mv.addObject("msg","Error...");
				e.getMessage();
			}
			return mv;
		}
		
		@PostMapping(value= "/colaborador-delete", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
		public ModelAndView delete() {
			ModelAndView mv = new ModelAndView("index");
			try {
				Colaboradores c = new Colaboradores();
				repoCol.delete(c);
				mv.addObject("msg","Data erased...");
			} catch (Exception e) {
				mv.addObject("msg","Error...");
				e.getMessage();
			}
			return mv;
		}
		
		@PostMapping(value= "/colaborador-findbycode", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
		public ModelAndView findbycode(@RequestParam String cod) {
			ModelAndView mv = new ModelAndView("index");
			try {
				mv.addObject("Resultado da Pesquisa: ", repoCol.findById(new Integer(cod)));
			} catch (Exception e) {
				mv.addObject("msg","Error...");
				e.getMessage();
			}
			return mv;
		}
		@GetMapping(value="/colaborador-list", produces=MediaType.APPLICATION_JSON_VALUE)
		public ModelAndView findall() {
			ModelAndView mv = new ModelAndView("index");
			try {
				mv.addObject("lista", repoCol.findAll());
			} catch (Exception e) {
				mv.addObject("Error ", e.getMessage());
			}
			return mv;
		}
}
