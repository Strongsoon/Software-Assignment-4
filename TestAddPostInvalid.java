
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestAddPostInvalid {
	
//This one fails

    @Test
    public void testAddPostInvalidTitle() {
        //setters
        Posts post = new Posts();
        post.setPostTitle("Invalid");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");

        assertFalse(post.addPost());
    }
    

// This one works
    @Test
    public void testAddPostValid() {
        //setters
        Posts post = new Posts();
        post.setPostTitle("Valid Post Title");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");

        assertTrue(post.addPost());
    }
}