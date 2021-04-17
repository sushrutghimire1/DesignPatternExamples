package behavioural.chainofresponsibility;

class ZeroProcessor extends Processor
{
    public ZeroProcessor(Processor processor){
        super(processor);
        System.out.println("Zero Processor");
    }

    public void process(Number request)
    {
        System.out.println("Zero Processing");
        if (request.getNumber() == 0)
        {
            System.out.println("ZeroProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
