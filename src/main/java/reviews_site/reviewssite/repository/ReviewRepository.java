package reviews_site.reviewssite.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import reviews_site.reviewssite.model.Review;

@Service
public class ReviewRepository {

	private Map<Long, Review> reviewRepository = new HashMap<>();

	public ReviewRepository() {
		add(new Review(1L, "Greg's Christas Sweater", "image", "Holliday", "Content", "date"));
		add(new Review(2L, "Greg's College Sweater", "image", "Historical", "Content", "date"));
		add(new Review(3L, "Greg's Inappropriately Small Sweater", "Historical", "category", "Content", "date"));
		add(new Review(4L, "Greg's Halloween Sweater", "image", "Holliday", "Content", "date"));
		add(new Review(5L, "Greg's Classy Sweater", "image", "Business Casual", "Content", "date"));
	}

	public void add(Review underTest) {
		reviewRepository.put(underTest.getId(), underTest);
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return reviewRepository.isEmpty();
	}

	public Review findOne(long id) {
		// TODO Auto-generated method stub
		return reviewRepository.get(id);
	}

	public Collection<Review> findAll() {
		// TODO Auto-generated method stub
		return reviewRepository.values();
	}

}
