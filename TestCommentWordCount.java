import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCommentWordCount {


    @Test
    public void testAddCommentValidWordCount() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");
        post.addPost();

        assertTrue(post.addComment("This is a valid comment with valid word count"));
    }
    
    @Test
    public void testAddCommentInvalidWordCount() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");
        post.addPost();

        assertFalse(post.addComment("Too short"));
    }    
}
