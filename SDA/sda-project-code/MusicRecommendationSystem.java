import java.util.ArrayList;
import java.util.List;

// User class to represent a user profile and their preferences
class User {
    private String name;
    private List<String> likedGenres;
    private List<String> likedSongs;
    private List<String> dislikedSongs;

    public User(String name, boolean isPremium) {
        this.name = name;
        this.likedGenres = new ArrayList<>();
        this.likedSongs = new ArrayList<>();
        this.dislikedSongs = new ArrayList<>();
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // User actions to like or dislike songs
    public void likeSong(String songId) {
        likedSongs.add(songId);
        System.out.println(name + " liked song ID: " + songId);
    }

    public void dislikeSong(String songId) {
        dislikedSongs.add(songId);
        System.out.println(name + " disliked song ID: " + songId);
    }

    public List<String> getLikedGenres() {
        return likedGenres;
    }

    public List<String> getLikedSongs() {
        return likedSongs;
    }
}

// Song class to represent a song entity
class Song {
    private String id;
    private String title;
    private String artist;
    private String genre;

    public Song(String id, String title, String artist, String genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " [" + genre + "]";
    }
}

// RecommendationEngine class for generating personalized recommendations
class RecommendationEngine {
    public List<Song> generateRecommendations(User user, List<Song> songDatabase) {
        List<Song> recommendations = new ArrayList<>();
        for (Song song : songDatabase) {
            // Recommend songs based on the user's liked genres and songs
            if (user.getLikedGenres().contains(song.getGenre()) && !user.getLikedSongs().contains(song.getId())) {
                recommendations.add(song);
            }
        }
        return recommendations;
    }
}

// Main class to simulate the real-time scenario
public class MusicRecommendationSystem {
    public static void main(String[] args) {
        // Sample data
        User hassanAliMashwani = new User("Hassan Ali Mashwani", true);
        hassanAliMashwani.getLikedGenres().add("Pop");
        hassanAliMashwani.getLikedGenres().add("Lo-Fi");

        // Simulate song database
        List<Song> songDatabase = new ArrayList<>();
        songDatabase.add(new Song("1", "Morning Breeze", "Lo-Fi Beats", "Lo-Fi"));
        songDatabase.add(new Song("2", "Sunshine Pop", "Pop Hits", "Pop"));
        songDatabase.add(new Song("3", "Night Chill", "Chillwave", "Lo-Fi"));
        songDatabase.add(new Song("4", "Indie Morning", "Indie Stars", "Indie"));

        // Generate recommendations for Hassan Ali Mashwani's morning commute
        RecommendationEngine recommendationEngine = new RecommendationEngine();
        List<Song> recommendations = recommendationEngine.generateRecommendations(hassanAliMashwani, songDatabase);

        System.out.println("Recommendations for " + hassanAliMashwani.getName() + "'s Morning Commute:");
        for (Song song : recommendations) {
            System.out.println("- " + song);
        }

        // Simulate feedback loop
        System.out.println("\nHassan Ali Mashwani is listening to recommendations...");
        hassanAliMashwani.likeSong("1");  // Hassan Ali Mashwani likes "Morning Breeze"
        hassanAliMashwani.dislikeSong("3"); // Hassan Ali Mashwani dislikes "Night Chill"

        // Update recommendations based on feedback
        recommendations = recommendationEngine.generateRecommendations(hassanAliMashwani, songDatabase);
        System.out.println("\nUpdated Recommendations for Hassan Ali Mashwani:");
        for (Song song : recommendations) {
            System.out.println("- " + song);
        }
    }
}

