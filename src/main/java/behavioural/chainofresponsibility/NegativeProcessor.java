package behavioural.chainofresponsibility;

class NegativeProcessor extends Processor
{
    public NegativeProcessor(Processor processor){
        super(processor);
        System.out.println("Negative Processor");
    }

    public void process(Number request)
    {
        System.out.println("Negative Processing");
        if (request.getNumber() < 0)
        {
            System.out.println("NegativeProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
