
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestValidComment {

    @Test
    public void testAddCommentValid() {
        Posts post = new Posts();
        //setters
        post.setPostTitle("Valid Post Title");
        post.setPostBody("This is a valid post body with more than 250 characters. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec a diam lectus. Sed sit amet ipsum mauris. Maecenas congue ligula ac quam viverra nec consectetur ante hendrerit. Donec et mollis dolor. Praesent et diam eget libero egestas mattis sit amet vitae augue. Nam tincidunt congue enim, ut porta lorem lacinia consectetur. Donec ut libero sed arcu vehicula ultricies a non tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");
        //add posts
        post.addPost();

        assertTrue(post.addComment("This is valid"));
    }
}