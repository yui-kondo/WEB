package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllSongtitle",
            query = "SELECT s FROM SongtitleDTO AS s ORDER BY s.song_id"
            )
})
@Table(name="tblSongtitle")
public class SongtitleDTO {
    // プロパティ
    @Id
    @Column(name = "song_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int song_id;

    @Column(name = "song_title")
    private String song_title;

    @Column(name = "comment")
    private String comment;

    @Column(name = "artist_num")
    private int artist_num;

    @Column(name = "tune_num")
    private int tune_num;

    @Column(name = "composition_ymd")
    private Timestamp composition_ymd;

    @Column(name = "series_num")
    private int series_num;


public int getSong_id() {
    return song_id;
}

public void setSong_id(int song_id) {
    this.song_id = song_id;
}

public String getSong_title() {
    return song_title;
}

public void setSong_title(String song_title) {
    this.song_title = song_title;
}

public String getComment() {
    return comment;
}

public void setComment(String comment) {
    this.comment = comment;
}

public int getArtist_num() {
    return artist_num;
}

public void setArtist_num(int artist_num) {
    this.artist_num = artist_num;
}

public int getTune_num() {
    return tune_num;
}

public void setTune_num(int tune_num) {
    this.tune_num = tune_num;
}

public Timestamp getComposition_ymd() {
    return composition_ymd;
}

public void setComposition_ymd(Timestamp composition_ymd) {
    this.composition_ymd = composition_ymd;
}

public int getSeries_num() {
    return series_num;
}

public void setSeries_num(int series_num) {
    this.series_num = series_num;
}

}