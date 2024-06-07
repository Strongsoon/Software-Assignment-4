import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCommentNumberEasy {


    @Test
    public void testAddCommentValidPostTypeEasy() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Easy");
        post.setPostEmergency("Ordinary");
        post.addPost();

        assertTrue(post.addComment("This is a valid comment"));
    }
    
    
    @Test
    public void testAddCommentInvalidPostTypeEasy() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Easy");
        post.setPostEmergency("Ordinary");
        post.addPost();

        // Adding a fourth comment, which should be invalid for "Easy" post type
        post.addComment("This is a valid comment");
        post.addComment("Another valid comment");
        post.addComment("Yet another valid comment");

        assertFalse(post.addComment("Fourth comment invalid"));
    }

}
