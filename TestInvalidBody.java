
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvalidBody {

    @Test
    public void testAddPostInvalidBody() {
        //setters
        Posts post = new Posts();
        post.setPostTitle("Valid Post Title");
        post.setPostBody("Short body.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");

        assertFalse(post.addPost());
    }
}