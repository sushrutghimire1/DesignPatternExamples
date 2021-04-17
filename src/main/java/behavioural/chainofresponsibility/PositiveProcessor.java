package behavioural.chainofresponsibility;

class PositiveProcessor extends Processor
{

    public PositiveProcessor(Processor processor){
        super(processor);
        System.out.println("Positive Processor");
    }

    public void process(Number request)
    {
        System.out.println("Positive Processing");
        if (request.getNumber() > 0)
        {
            System.out.println("PositiveProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
