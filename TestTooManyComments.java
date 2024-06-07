import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTooManyComments {

    @Test
    public void testAddCommentInvalidCount() {
        Posts post = new Posts();
        post.setPostTitle("Valid Post Title");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Easy");
        post.setPostEmergency("Ordinary");

        post.addPost();  // Add post first

        // Add maximum allowed comments first
        post.addComment("This is valid comment");
        post.addComment("This is valid comment too");
        post.addComment("Another valid comment");

        assertFalse(post.addComment("One more comment"));
    }
    
    @Test
    public void testAddCommentValidCount() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Easy");
        post.setPostEmergency("Ordinary");

        assertTrue(post.addPost());  // Add post first and check it is successful

        // Add comments and check if they're added successfully
        assertTrue(post.addComment("This is a valid comment"));
        assertTrue(post.addComment("This is another valid comment"));
        assertTrue(post.addComment("Yet another valid comment"));
    }

}
