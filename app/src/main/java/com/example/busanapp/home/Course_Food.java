package com.example.busanapp.home;

public class Course_Food {
    private String Title;
    private String Category;
    private String Description;
    private String Description2;
    private String Description3;
    private String Description4;
    private String Description5;
    private String Description6;
    private String Description7;

    private int Thumbnail;
    private int Thumbnail2;
    private int Thumbnail3;
    private int Thumbnail4;
    private int Thumbnail5;
    private int Thumbnail6;
    private int Thumbnail7;

    public Course_Food(String title, String category, String description
            , String description2, String description3, String description4
            , String description5, String description6, String description7

            , int thumbnail, int thumbnail2, int thumbnail3
            , int thumbnail4, int thumbnail5, int thumbnail6, int thumbnail7
    ) {
        Title = title;
        Category = category;

        Description = description;
        Description3 = description3;
        Description4 = description4;
        Description5 = description5;
        Description6 = description6;
        Description7 = description7;

        Description2 = description2;

        Thumbnail2 = thumbnail2;
        Thumbnail = thumbnail;
        Thumbnail3 = thumbnail3;
        Thumbnail4 = thumbnail4;
        Thumbnail5 = thumbnail5;
        Thumbnail6 = thumbnail6;
        Thumbnail7 = thumbnail7;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public String getDescription2() {
        return Description2;
    }

    public String getDescription3() {
        return Description3;
    }

    public String getDescription4() {
        return Description4;
    }

    public String getDescription5() {
        return Description5;
    }

    public String getDescription6() {
        return Description6;
    }

    public String getDescription7() {
        return Description7;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public int getThumbnail2() {
        return Thumbnail2;
    }

    public int getThumbnail3() {
        return Thumbnail3;
    }

    public int getThumbnail4() {
        return Thumbnail4;
    }

    public int getThumbnail5() {
        return Thumbnail5;
    }

    public int getThumbnail6() {
        return Thumbnail6;
    }

    public int getThumbnail7() {
        return Thumbnail7;
    }
}
