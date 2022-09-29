package com.yao.demo.builderpattern;
/*
 * @author Jack
 * @date 2022/7/21
 * */

public class PersonDTO {
    private int id;
    private String name;

    //DTO to Entity
    public static PersonEntity convertToEntity(PersonDTO dto){
        return PersonEntity.builder()
                .id(dto.getId())
                .name(dto.name)
                .build();

    }

    private PersonDTO(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class Builder{
        private int id;
        private String name;

        public Builder() {
        }

        public Builder id(int val){
            this.id = val;
            return this;
        }
        public Builder name(String val){
            this.name = val;
            return this;
        }

        public PersonDTO build(){
        return new PersonDTO(this);
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
