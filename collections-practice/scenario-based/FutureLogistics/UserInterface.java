package scenario.FutureLogistics;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details");
        String input = scanner.nextLine();

        String transportId = input.split(":")[0];

        if (!Utility.validateTransportId(transportId)) {
        	scanner.close();
            return;
        }

        GoodsTransport goodsTransport = Utility.parseDetails(input);
        String objectType = Utility.findObjectType(goodsTransport);

        System.out.println("Transporter id : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

        if (objectType.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) goodsTransport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        } else {
            TimberTransport tt = (TimberTransport) goodsTransport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + goodsTransport.vehicleSelection());
        System.out.println("Total charge : " + goodsTransport.calculateTotalCharge());

        scanner.close();
    }
}