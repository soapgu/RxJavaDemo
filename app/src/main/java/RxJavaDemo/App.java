/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package RxJavaDemo;

import io.reactivex.rxjava3.core.Maybe;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
       


        stageOne()
        .flatMap( t -> stageTwo())
        .flatMap( t->  stageThree() )
        .flatMap( t -> stageFour() )
        .subscribe( t -> System.out.println("success:" + t) , 
                    e ->  System.out.println(e.toString() ) ,
                    () -> System.out.println( "step has skipped!!" ) );
    }

    public static Maybe<Boolean> stageOne(){
        System.out.println( "Stage one: do some job" );
        return Maybe.just(true);
    }

    public static Maybe<Boolean> stageTwo(){
        System.out.println( "Stage two: do some job" );
        return Maybe.just(true);
    }

    public static Maybe<Boolean> stageThree(){
        System.out.println( "Stage three: do some job" );
        return Maybe.just(true);
    }

    public static Maybe<Boolean> stageFour(){
        System.out.println( "Stage four: do some job" );
        return Maybe.just(true);
    }



}
