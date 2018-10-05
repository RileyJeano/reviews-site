package reviews_site.reviewssite.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import reviews_site.reviewssite.repository.ReviewRepository;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewRepo = new ReviewRepository();

	// Request
	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@GetMapping("/reviews/{id}")
	public String getReview(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";

	}
}
