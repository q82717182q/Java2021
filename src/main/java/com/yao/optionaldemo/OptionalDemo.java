//package com.yao.optionaldemo;
//
//import java.util.Optional;
//import com.yao.optionaldemo.Person;
//
///**
// * Created by Jack Yao on 2022/2/27 11:00 AM
// */
//public class OptionalDemo {
//    public static void main(String[] args) {
//
//        Car car1 = new Car(1,"Jack");
//        Optional<Car> optCar1 = Optional.ofNullable(car1);
//        Optional<Person> optPerson = Optional.of(new Person());
////        Optional<String> name = optPerson.map(Person::getCar).map(Car::getInsurance).map(Insurance::getName);//這樣會錯，因為但是這段程式碼無法通過編譯，person是Optional<Person>型別的變數，呼叫map方法沒有問題，但是getCar返回的是一個Optional<Car>型別的物件，這意味著map操作的結果的結果是一個Optional<Optinoal<Car>>型別的物件。 因此它呼叫getInsurance是非法的。
//        Optional<String> name = optPerson.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName);//在流中使用flatMap可以扁平化合並流，在這裡你想把兩層的Optional合併為一個。
//
//
//
//    }
//    public String getCarInsuranceName(Person p){
//        Optional<Person> person = Optional.of(p);
//        return person.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
//    }
//
//    public static Insurance getInsurance(Person person ,Car car){
//        //業務邏輯
//        return new Insurance();
//    }
//
//    public static Optional<Insurance> getInsuranceOpt(Optional<Person> person,Optional<Car> car){
//        if(person.isPresent() && car.isPresent()){
//            return Optional.of(getInsurance(person.get(),car.get()));
//        }
//        return Optional.empty();
//    }
//
//    public Optional<Insurance> getInsuranceOpt1(Optional<Person> person, Optional<Car> car){
////        return person.flatMap(p -> car.map(c -> getInsuranceOpt(p, c)));
//        return null;
//    }
//
//}
