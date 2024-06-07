import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Posts {
    private int postID;
    private String postTitle;
    private String postBody;
    private String[] postTags;
    private String postType;
    private String postEmergency;
    private ArrayList<String> postComments = new ArrayList<>();

    private static final String[] postTypes = {"Very Difficult", "Difficult", "Easy"};
    private static final String[] postEmergencies = {"Immediately Needed", "Highly Needed", "Ordinary"};

    public boolean addPost() {
    	
        // Post title length and first 5 characters
        if (postTitle.length() < 10 || postTitle.length() > 250 ||
            !Pattern.matches("^[a-zA-Z]{5}.*", postTitle)) {
            return false;
        }

        // Post body length
        if (postBody.length() < 250) {
            return false;
        }

        // Tags count and format
        if (postTags.length < 2 || postTags.length > 5) {
            return false;
        }
        for (String tag : postTags) {
            if (tag.length() < 2 || tag.length() > 10 || !tag.equals(tag.toLowerCase())) {
                return false;
            }
        }

        // Difficulty and body length based on type
        if ((postType.equals(postTypes[2]) && postTags.length > 3) ||
            ((postType.equals(postTypes[0]) || postType.equals(postTypes[1])) && postBody.length() < 300)) {
            return false;
        }

        // Emergency status based on type
        if ((postType.equals(postTypes[2]) && (postEmergency.equals(postEmergencies[0]) || postEmergency.equals(postEmergencies[1]))) ||
            ((postType.equals(postTypes[0]) || postType.equals(postTypes[1])) && postEmergency.equals(postEmergencies[2]))) {
            return false;
        }

        // If all True, write to file and return true
        try (FileWriter writer = new FileWriter("post.txt", true)) {
            writer.write("Post ID: " + postID + "\n");
            writer.write("Title: " + postTitle + "\n");
            writer.write("Body: " + postBody + "\n");
            writer.write("Tags: " + String.join(", ", postTags) + "\n");
            writer.write("Type: " + postType + "\n");
            writer.write("Emergency: " + postEmergency + "\n");
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean addComment(String comment) {
        // Comment text format
        String[] words = comment.split("\\s+");
        if (words.length < 4 || words.length > 10 || !Character.isUpperCase(words[0].charAt(0))) {
            return false;
        }

        // Comments count and post type restrictions
        if (postComments.size() >= 5 ||
            ((postType.equals(postTypes[2]) || postEmergency.equals(postEmergencies[2])) && postComments.size() >= 3)) {
            return false;
        }

        // If all true, write to file and return true
        try (FileWriter writer = new FileWriter("comment.txt", true)) {
            writer.write("Post ID: " + postID + "\n");
            writer.write("Comment: " + comment + "\n");
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        postComments.add(comment);
        return true;
    }

//methods for setting attributes
    
public int getPostID() {
    return postID;
}

public void setPostID(int postID) {
    this.postID = postID;
}

public String getPostTitle() {
    return postTitle;
}

public void setPostTitle(String postTitle) {
    this.postTitle = postTitle;
}

public String getPostBody() {
    return postBody;
}

public void setPostBody(String postBody) {
    this.postBody = postBody;
}

public String[] getPostTags() {
    return postTags;
}

public void setPostTags(String[] postTags) {
    this.postTags = postTags;
}

public String getPostType() {
    return postType;
}

public void setPostType(String postType) {
    this.postType = postType;
}

public String getPostEmergency() {
    return postEmergency;
}

public void setPostEmergency(String postEmergency) {
    this.postEmergency = postEmergency;
}

}

