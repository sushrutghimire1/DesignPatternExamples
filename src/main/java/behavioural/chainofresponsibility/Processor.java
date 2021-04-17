package behavioural.chainofresponsibility;

abstract class Processor
{
    private final Processor processor;

    public Processor(Processor processor){
        System.out.println("Abstract Processor");
        this.processor = processor;
    };

    public void process(Number request){
        if(processor != null)
            processor.process(request);
        System.out.println("Abstract Processing");
    };
}
