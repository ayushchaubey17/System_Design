package design_Patterns.singleTon;

public class LazyInitialization {
    private  static  LazyInitialization lazyInitialization ;

    private LazyInitialization() {

    }



    private  static  class  SingletonnInnner{
        private  static  LazyInitialization INSTANCE = new LazyInitialization();
    }


    public  static  LazyInitialization  getTheInstance(){
        return SingletonnInnner.INSTANCE ;
    }

    // type 1--- but its not thread safe
//    public  static  LazyInitialization getInstance(){
//        if (lazyInitialization==null){
//            lazyInitialization = new LazyInitialization();
//        }
//        return lazyInitialization;
//    }



    // type 2-- now its thread safe but no other threads enters also at the reamining parts of method
//    public  static synchronized LazyInitialization getInstance(){
//        if (lazyInitialization==null){
//            lazyInitialization = new LazyInitialization();
//        }
//        return lazyInitialization;
//    }




    // type 3-- prevent it from bad performance
     public  static  LazyInitialization getInstance() {

         if (lazyInitialization == null) {

             synchronized (LazyInitialization.class) {
                 if (lazyInitialization == null) {
                     lazyInitialization = new LazyInitialization();
                 }
             }

         }

         return lazyInitialization;
     }



}
