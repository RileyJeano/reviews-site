package reviews_site.reviewssite.repository;

import static org.hamcrest.Matchers.hasItems;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import reviews_site.reviewssite.model.Review;

@RunWith(SpringRunner.class)
public class ReviewRepositoryTest {

	@Resource
	ReviewRepository reviewRepo;

	@Test
	public void shouldPutAReviewinCollection() {
		Review underTest = new Review(1L);
		reviewRepo.add(underTest);
		Assert.assertEquals(false, reviewRepo.isEmpty());
	}

	@Test
	public void shouldBeAbleToReturnOneReview() {
		Review underTest = new Review(1L);
		reviewRepo.add(underTest);
		Review foundReview = reviewRepo.findOne(1L);
		Assert.assertEquals("Holidays", foundReview.getCategory());
	}

	@Test
	public void shouldBeAbleToReturnAllReviews() {
		Review review1 = new Review(1L);
		Review review2 = new Review(2L);
		reviewRepo.add(review1);
		reviewRepo.add(review2);
		Collection<Review> foundReviews = reviewRepo.findAll();
		Assert.assertThat(foundReviews, hasItems(review1, review2));
	}
}
