package reviews_site.reviewssite.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import reviews_site.reviewssite.repository.ReviewRepository;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewRepo;

	// Request
	@GetMapping("/reviews")
	public String getStudents() {

		return "reviews";
	}
}
