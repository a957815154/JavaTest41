package com.hand.domain.entity;

public class FilmE {
    private Integer film_id;
    private String title;
    private String description;
    private Integer release_year;
    private Integer language_id;
    private Integer original_language_id;
    private Integer rental_duration;
    private Integer rental_rate;
    private Integer length;
    private Double replacement_cost;
    private String rating;

    public Integer getFilm_id()
    {
        return film_id;
    }

    public void setFilm_id(Integer film_id)
    {
        this.film_id = film_id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getRelease_year()
    {
        return release_year;
    }

    public void setRelease_year(Integer release_year)
    {
        this.release_year = release_year;
    }

    public Integer getLanguage_id()
    {
        return language_id;
    }

    public void setLanguage_id(Integer language_id)
    {
        this.language_id = language_id;
    }

    public Integer getOriginal_language_id()
    {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id)
    {
        this.original_language_id = original_language_id;
    }

    public Integer getRental_duration()
    {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration)
    {
        this.rental_duration = rental_duration;
    }

    public Integer getRental_rate()
    {
        return rental_rate;
    }

    public void setRental_rate(Integer rental_rate)
    {
        this.rental_rate = rental_rate;
    }

    public Integer getLength()
    {
        return length;
    }

    public void setLength(Integer length)
    {
        this.length = length;
    }

    public Double getReplacement_cost()
    {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost)
    {
        this.replacement_cost = replacement_cost;
    }

    public String getRating()
    {
        return rating;
    }

    public void setRating(String rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "FilmE{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release_year=" + release_year +
                ", language_id=" + language_id +
                ", original_language_id=" + original_language_id +
                ", rental_duration=" + rental_duration +
                ", rental_rate=" + rental_rate +
                ", length=" + length +
                ", replacement_cost=" + replacement_cost +
                ", rating='" + rating + '\'' +
                '}';
    }
}
