package reviews_site.reviewssite.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/*
 * These annotations configure our testing environment
 * 
 * @RunWith - tells JUnit the runtime env is Spring
 * @WebMvcTest - tells our test the behavior we're
 *     testing can be found in the StudentController
 * 
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerTest {

	/*
	 * @Autowired - a Spring annotation that will find you a version of whatever you
	 * specify and inject that dependency.
	 * 
	 */
	@Autowired
	private MockMvc mockMvc;

	/*
	 * Remember we are mocking Springs MVC structure.
	 * 
	 * Which is to say we are using a fake version of Spring MVC so we can isolate
	 * our tests to just the @Controller we're creating
	 * 
	 */

	@Test
	public void shouldBeOkWhenAccessingRewiews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnStudentsTemplateWhenAccessingReviews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(view().name("reviews"));
	}
}