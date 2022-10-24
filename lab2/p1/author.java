package ru.mirea.lab2.p1;

class author {
    protected String name;
    protected String email;
    protected char gender;

    author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    protected String getName() {
        return this.name;
    }

    protected String getEmail() {
        return this.email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected char getGender() {
        return this.gender;
    }

    public String toString() {
        return "Author name: " + this.name + "\nAuthor email: " + this.email + "\nAuthor gender: " + this.gender;
    }
}


