import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCommentLength {

    @Test
    public void testAddCommentValidLength() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");
        post.addPost();

        assertTrue(post.addComment("This is a valid comment"));
    }
    
    @Test
    public void testAddCommentInvalidLength() {
        Posts post = new Posts();
        post.setPostTitle("ValidPostTitle");
        post.setPostBody("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce odio mauris, porttitor in dolor eu, vulputate ornare erat. Fusce ornare ante nisl, in ultrices nulla hendrerit ut. Nulla facilisi. Ut molestie urna tortor, eget pharetra lectus porta at. Nunc commodo odio non lorem tristique mattis. Fusce sed leo.");
        post.setPostTags(new String[] {"tag1", "tag2"});
        post.setPostType("Difficult");
        post.setPostEmergency("Highly Needed");
        post.addPost();

        assertFalse(post.addComment("Invalid"));
    }
}
