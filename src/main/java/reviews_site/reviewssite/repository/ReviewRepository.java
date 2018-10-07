package reviews_site.reviewssite.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import reviews_site.reviewssite.model.Review;

//Donny you changed this
@Service
public class ReviewRepository {

	private Map<Long, Review> reviewRepository = new HashMap<>();

	public ReviewRepository() {
		add(new Review(1L, "Greg's Christmas Sweater", "pillbug-small.jpg", "Holliday",
				"8.7/10 - \rNever have I been so gifted, as to see Greg's Chrsitmas Sweater. It was the greatest gift one could recieve. I believe his Great Aunt Mable knitted it for him some years back. It is covered in the finest layer of cat hair, from said Great Aunt Mable. He begins wearing this sweater sometime in mid November and does not take it off till the new year. I dare say he bathes in it. Of all his sweaters this is one of my favorites.",
				"12/25/1993"));
		add(new Review(2L, "Greg's College Sweater", "image", "Historical",
				"7.5/10 - \rThis sweater eminates a kind of naive, hapless earnestness. It doesn't seem to notice how tight it's become, to its benefit. Greg bought this his sophomore year after he finished his cynical phase, and almost lost it in the lake during one of our late-night escapades. The way it smelled for the next week, I wish he had.",
				"05/06/1990"));
		add(new Review(3L, "Greg's Inappropriately Small Sweater", "image", "Historical",
				"10/10 - \rWhy would you give such an ill-fitting sweater such a high score? I went back and forth on this, but I decided in the end that while it gains no points for fashion, taste, respectability, sense, or general ability of anyone accompanying Greg to maintain their composure, it has its own appeal. When Greg was in high school, he spent a summer abroad in Bratislava, and his little sister decided it might get cold there, so she bought him a wool sweater. As soon as Greg arrived in Czechoslovakia he washed and dried his sweater and shrunk it down to dog size. He felt so bad about it that he continued wearing it anyway, and has since.",
				"07/12/2003"));
		add(new Review(4L, "Greg's Halloween Sweater", "image", "Holliday",
				"4/10 - \rGreg has made a lot of bad decisions in his life. There was the time share in Nepal, there was the vacation to Indianapolis, but his Halloween Sweater makes it into the cannon of great disasters. It is neither spooky, nor cute. I've never felt the hint of a shiver run down my spine. I've never felt warm, fuzzy, harvest-time feelings either. What purpose does this sweater serve? What is its target audience? I don't think anyone knows.",
				"10/04/1998"));
		add(new Review(5L, "Greg's Kind of Classy Sweater", "image", "Business Casual",
				"6.5/10 - \rThis one is an honest argyle Greg found for 10% off at JC Penny back in 1999. He didn't belive in Y2K and wore this sweater to our New Years party that year, but that history came out in the next wash and it remains an unassuming argyle sweater. It blends in at business meetings better than a bic ballpoint.",
				"03/15/2001"));
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
