import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvalidComment {

    @Test
    public void testAddCommentInvalidCase() {
        Posts post = new Posts();
        post.setPostTitle("Valid Post Title");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");

        post.addPost();  // Add post first

        assertFalse(post.addComment("invalid comment"));
    }
    
    @Test
    public void testAddCommentValid() {
        Posts post = new Posts();
        //setters
        post.setPostTitle("Valid Post Title");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");
        //add posts
        post.addPost();

        assertTrue(post.addComment("This is valid cause so"));
    }
}
