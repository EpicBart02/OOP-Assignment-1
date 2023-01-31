package assignmentone;


public class Album {
  private String name;
  private Integer releaseYear;
  private String artist;

  public Album(String realName, Integer realReleaseYear, String realArtist){
    setName(realName);
    setYear(realReleaseYear);
    setArtist(realArtist);
  }

  public void setName(String realName){
    if(realName != null && realName.length() >= 4){
      this.name = realName;
    }
    else{
      name = "No name";
    }
  }

  public String getName(){
    return name;
  }

  public void setYear(Integer realReleaseYear){
    if(realReleaseYear > 1800 && realReleaseYear < 2030){
      releaseYear = realReleaseYear;
    }
    else{
      releaseYear = -1;
    }
  }

  public Integer getYear(){
    return releaseYear;
  }

  public void setArtist(String realArtist){
    if(realArtist != null && realArtist.length() >= 4){
      artist = realArtist;
    }
    else{
      artist = "No artist";
    }
  }

  public String getArtist(){
    return artist;
  }

}
