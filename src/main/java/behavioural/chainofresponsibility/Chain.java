package behavioural.chainofresponsibility;

public class Chain
{
    Processor chain;

    public Chain(){
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }

}

