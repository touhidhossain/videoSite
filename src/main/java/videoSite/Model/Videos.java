package videoSite.Model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by root on 12/13/16.
 */
public class Videos implements Serializable{

    private static final long serialVersionUID = 6850802524690313747L;

    private long videoId;

    private MultipartFile video;

    private MultipartFile image;

    private String category;

    private double videoDuration;

    private String details;

    private String owner;

    private int like;

    private int dislike;

    private int viewers;

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public MultipartFile getVideo() {
        return video;
    }

    public void setVideo(MultipartFile video) {
        this.video = video;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }
}
