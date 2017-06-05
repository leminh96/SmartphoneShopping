package com.leminh.controller;

import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.leminh.dao.SmartphoneDAO;
import com.leminh.dao.UserInfoDAO;
import com.leminh.entity.User;
import com.leminh.validator.SmartphoneValidator;
import com.leminh.model.SmartphoneInfo;
import com.leminh.model.UserInfo;

@Controller
@Transactional
@EnableWebMvc
public class MainController {
	@Autowired
	private SmartphoneDAO smartphoneDAO;

	@Autowired
	private UserInfoDAO userInfoDAO;

	@Autowired
	private SmartphoneValidator smartphoneValidator;
	
	@InitBinder
	protected void initBinder(WebDataBinder dataBinder) {
		Object target = dataBinder.getTarget();
		if (target == null) {
			return;
		}
		System.out.println("Target=" + target);

		if (target.getClass() == SmartphoneInfo.class) {
			dataBinder.setValidator(smartphoneValidator);
		}
	}
	
	@ModelAttribute
	public void sendUserInfo(Model model){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName();
        User u = userInfoDAO.findUserByUsername(userName);
        model.addAttribute("buget", u);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(Model model) {
		return "loginPage";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String homePage(Model model) {
		return "welcomePage";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(Model model) {
		return "redirect:/smartphoneList";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "loginPage";
	}

	@RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
	public String logoutSuccessfulPage(Model model) {
		return "redirect:/login";
	}

	@RequestMapping(value = "/userInfo")
	public String userInfos(Model model, @RequestParam(value = "username", required = true) String username) {
		User user = null;
		user = this.userInfoDAO.findUserByUsername(username);
		model.addAttribute("userInfos", user);
		return "userInfoPage";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {
		if (principal != null) {
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403Page";
	}

	@RequestMapping("/smartphoneList")
	public String smartphoneList(Model model) {
		List<SmartphoneInfo> list = smartphoneDAO.listSmartphoneInfos();
		model.addAttribute("smartphoneInfos", list);
		return "smartphoneList";
	}

	private String formSmartphone(Model model, SmartphoneInfo smartphoneInfo) {
		model.addAttribute("smartphoneForm", smartphoneInfo);

		if (smartphoneInfo.getId() == 0) {
			model.addAttribute("formTitle", "Create Smartphone");
		} else {
			model.addAttribute("formTitle", "Edit Smartphone");
		}
		return "formSmartphone";
	}

	@RequestMapping("/createSmartphone")
	public String createSmartphone(Model model) {
		SmartphoneInfo smartphoneInfo = new SmartphoneInfo();
		return this.formSmartphone(model, smartphoneInfo);
	}

	@RequestMapping("/editSmartphone")
	public String editSmartphone(Model model, @RequestParam("id") int id) {
		SmartphoneInfo smartphoneInfo = null;
		if (id == (int) id) {
			smartphoneInfo = this.smartphoneDAO.findSmartphoneInfo(id);
		}
		if (smartphoneInfo == null) {
			return "redirect:/smartphoneList";
		}

		return this.formSmartphone(model, smartphoneInfo);
	}

	@RequestMapping("/deleteSmartphone")
	public String deleteSmartphone(Model model, @RequestParam("id") int id) {
		if (id == (int) id) {
			this.smartphoneDAO.deleteSmartphone(id);
		}
		return "redirect:/smartphoneList";
	}


	@RequestMapping(value = "/saveSmartphone", method = RequestMethod.POST)
	public String saveSmartphone(Model model,
			@ModelAttribute("smartphoneForm") @Validated SmartphoneInfo smartphoneInfo, BindingResult result,
			final RedirectAttributes redirectAttributes) {

		if (result.hasErrors()) {
			return this.formSmartphone(model, smartphoneInfo);
		}
		this.smartphoneDAO.saveSmartphone(smartphoneInfo);
		redirectAttributes.addFlashAttribute("message", "Save Smartphone Successful");
		return "redirect:/smartphoneList";
	}

}
