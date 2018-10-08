package reviews_site.reviewssite.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import reviews_site.reviewssite.model.Review;
import reviews_site.reviewssite.repository.ReviewRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ReviewRepository reviewRepo;
	
	@Mock
	Review reviewOne;
	
	@Test
	public void shouldBeOkWhenAccessingRewiews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnStudentsTemplateWhenAccessingReviews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(view().name("reviews"));
	}

	@Test
	public void shouldBeOkWhenAccessingRewiew() throws Exception {
		when(reviewRepo.findOne(1L)).thenReturn(reviewOne);
		mockMvc.perform(get("/reviews/1")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnStudentsTemplateWhenAccessingReview() throws Exception {
		when(reviewRepo.findOne(1L)).thenReturn(reviewOne);
		mockMvc.perform(get("/reviews/1")).andExpect(view().name("review"));
	}
}