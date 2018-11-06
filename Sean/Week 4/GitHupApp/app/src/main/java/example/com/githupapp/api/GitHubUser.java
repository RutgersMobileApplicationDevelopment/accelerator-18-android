package example.com.githupapp.api;

import com.google.gson.annotations.SerializedName;

public class GitHubUser {
    @SerializedName("login")
    private String username;
    private String name;
    private String bio;

    public GitHubUser(String username, String name, String bio) {
        this.username = username;
        this.name = name;
        this.bio = bio;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}
