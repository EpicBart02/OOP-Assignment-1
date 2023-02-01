package assignmentone;

/**
 * This is the solution for the Album task.
 */

public class Album {
  /**
   * Creating private class variables for Album.
   */
  private String name;
  private Integer releaseYear;
  private String artist;

  /**
   * This method sets all the variables of the specific album.
   */

  public Album(String realName, Integer realReleaseYear, String realArtist) {
    setName(realName);
    setYear(realReleaseYear);
    setArtist(realArtist);
  }

  /**
   * The method setName sets the name to the input variable as long as its 4 charachers or longer.
   * otherwise its set to "No name".
   * The method getName just returns the name variable.
   */

  public void setName(String realName) {
    if (realName != null && realName.length() >= 4) {
      this.name = realName;
    } else {
      name = "No name";
    }
  }

  public String getName() {
    return name;
  }

  /**
   * The method setYear sets the year to the input variable as long as its between 1800-2030.
   * otherwise it gets set to -1.
   * getYear just returns the variable.
   */

  public void setYear(Integer realReleaseYear) {
    if (realReleaseYear > 1800 && realReleaseYear < 2030) {
      releaseYear = realReleaseYear;
    } else {
      releaseYear = -1;
    }
  }

  public Integer getYear() {
    return releaseYear;
  }

  /**
   * This method works just like setName, but it sets the artist instead.
   * The rule for =>4 still applies.
   * getArtist returns the variable "Artist".
   */

  public void setArtist(String realArtist) {
    if (realArtist != null && realArtist.length() >= 4) {
      artist = realArtist;
    } else {
      artist = "No artist";
    }
  }

  public String getArtist() {
    return artist;
  }

}
