import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmergencyType {

    @Test
    public void testAddPostInvalidPostEmergency() {
        Posts post = new Posts();
        post.setPostTitle("Valid Post Title");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2", "tag3"}); 
        post.setPostType("Easy");
        post.setPostEmergency("Immediately Needed"); // Invalid emergency type for "Easy"

        assertFalse(post.addPost());
    }

    @Test
    public void testAddPostValidPostEmergency() {
        Posts post = new Posts();
        post.setPostTitle("Valid Post Title"); 
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2", "tag3"}); 
        post.setPostType("Difficult"); 
        post.setPostEmergency("Highly Needed"); // Valid emergency type for "Difficult"

        assertTrue(post.addPost());
    }
}