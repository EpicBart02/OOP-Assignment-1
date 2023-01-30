package assignmentone;


public class Album {
  private String name;
  private Integer releaseYear;
  private String artist;

  public Album(String realName, Integer realReleaseYear, String realArtist){
    setName(realName);
    setReleaseYear(realReleaseYear);
    setArtist(realArtist);
  }

  public void setName(String realName){
    if(realName.length() >= 4){
      this.name = realName;
    }
    else{
      name = "No Name";
    }
  }

  public String getName(){
    return name;
  }

  public void setReleaseYear(Integer realReleaseYear){
    if(realReleaseYear > 1800 && realReleaseYear < 2030){
      releaseYear = realReleaseYear;
    }
    else{
      releaseYear = -1;
    }
  }

  public Integer getReleaseYear(){
    return releaseYear;
  }

  public void setArtist(String realArtist){
    if(realArtist.length() >= 4){
      artist = realArtist;
    }
    else{
      artist = "No Artist";
    }
  }

  public String getArtist(){
    return artist;
  }

}
