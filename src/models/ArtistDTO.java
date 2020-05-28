package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllArtist",
            query = "SELECT a FROM ArtistDTO AS a"
            )
})
@Table(name="tblArtist")
public class ArtistDTO {
    // プロパティ
    @Id
    @Column(name = "artist_id")
    private int artist_id;

    @Column(name = "artist_name")
    private String artist_name;

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_title(String artist_name) {
        this.artist_name = artist_name;
    }

}
