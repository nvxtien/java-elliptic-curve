package com.tiennv.ec;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class GFp2Test {

    @Test
    public void expTest() {
        GFp2 gFp2 = new GFp2(new GFp(BigInteger.valueOf(1)), new GFp(BigInteger.valueOf(3)));
        GFp2 expected = gFp2.exp(BigInteger.valueOf(1));
        expected.print();

        GFp2 actual = new GFp2(new GFp(BigInteger.valueOf(1)), new GFp(BigInteger.valueOf(3)));

        assertEquals(actual, expected);

        expected = gFp2.exp(BigInteger.valueOf(2));
        expected.print();
        actual = new GFp2(new GFp(BigInteger.valueOf(6)), new GFp(BigInteger.valueOf(8)));
        assertEquals(actual, expected);

        expected = gFp2.exp(BigInteger.valueOf(3));
        expected.print();
        actual = new GFp2(new GFp(BigInteger.valueOf(26)), new GFp(BigInteger.valueOf(18)));
        assertEquals(actual, expected);

        expected = gFp2.exp(BigInteger.valueOf(13));
        expected.print();
        actual = new GFp2(new GFp(BigInteger.valueOf(-2729024)), new GFp(BigInteger.valueOf(-1597632)));
        actual.print();
        assertEquals(actual, expected);

        expected = gFp2.exp(BigInteger.valueOf(43));
        expected.print();
        actual = new GFp2(new GFp(new BigInteger("3019264689115366424576")), new GFp(new BigInteger("940234405380429447168")));
        actual.print();
        assertEquals(actual, expected);

        expected = gFp2.exp(BigInteger.valueOf(43));
        expected.print();
        actual = new GFp2(new GFp(new BigInteger("3019264689115366424576")), new GFp(new BigInteger("940234405380429447168")));
        actual.print();
        assertEquals(actual, expected);

//        GFp2 expected43 = gFp2.exp(BigInteger.valueOf(43));
//        expected43.print();
//        GFp2 actual43 = new GFp2(new GFp(new BigInteger("3019264689115366424576")), new GFp(new BigInteger("940234405380429447168")));
//        actual43.print();
//        assertEquals(actual43, expected43);

        expected = gFp2.exp(BigInteger.valueOf(44));
        expected.print();
        actual = new GFp2(new GFp(new BigInteger("9998028472726528720896")), new GFp(new BigInteger("65000549695646603732796438742359905742825358107623003571678583553890105988711")));
        actual.print();
        assertEquals(actual, expected);

//        GFp2 expected44 = gFp2.exp(BigInteger.valueOf(44));
//        expected44.print();
//        GFp2 actual44 = new GFp2(new GFp(new BigInteger("9998028472726528720896")), new GFp(new BigInteger("65000549695646603732796438742359905742825358107623003571678583553890105988711")));
//        actual44.print();
//        assertEquals(actual44, expected44);

        GFp2 actual45 = gFp2.exp(BigInteger.valueOf(45));
        System.out.println("++++++++");
        actual45.print();
        GFp2 expected45 = new GFp2(new GFp(new BigInteger("29795523945205508079616")), new GFp(new BigInteger("65000549695646603732796438742359905742825358107623003561283432135215421101671")));
        expected45.print();
        assertEquals(expected45, actual45);

        GFp2 actual1 = gFp2.exp(BigInteger.valueOf(1));
        System.out.println("++++++++");
        actual1.print();
        GFp2 expected1 = new GFp2(new GFp(new BigInteger("1")), new GFp(new BigInteger("3")));
        expected1.print();
        assertEquals(expected1, actual1);


        GFp2 actual46 = gFp2.exp(Fp256BN.p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(3)));
        System.out.println("++++++++");
        actual46.print();


//        GFp2 xiToPMinus1Over6 = gFp2.exp(BigInteger.valueOf(46));
//        System.out.println("++++++++");
//        actual46.print();

//        GFp2 expected45 = new GFp2(new GFp(new BigInteger("29795523945205508079616")), new GFp(new BigInteger("65000549695646603732796438742359905742825358107623003561283432135215421101671")));
//        expected45.print();
//        assertEquals(expected45, actual45);

        // γ1,i = u^(i·(p−1)/6)
        GFp2 gamma11 = gFp2.exp(Fp256BN.p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(6)));
        gamma11.print();
        // GFp2{x=8669379979083712429711189836753509758585994370025260553045152614783263110636, y=19998038925833620163537568958541907098007303196759855091367510456613536016040}
//        gamma11.getX().getValue();

        // xiToPMinus1Over6 is ξ^((p-1)/6) where ξ = i+3.
//        var xiToPMinus1Over6 = &gfP2{bigFromBase10("8669379979083712429711189836753509758585994370025260553045152614783263110636"), bigFromBase10("19998038925833620163537568958541907098007303196759855091367510456613536016040")}


        GFp2 gamma12 = gFp2.exp(Fp256BN.p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(3)));
        gamma12.print();
        // GFp2{x=26098034838977895781559542626833399156321265654106457577426020397262786167059, y=15931493369629630809226283458085260090334794394361662678240713231519278691715}
// xiToPMinus1Over3 is ξ^((p-1)/3) where ξ = i+3.
//var xiToPMinus1Over3 = &gfP2{bigFromBase10("26098034838977895781559542626833399156321265654106457577426020397262786167059"), bigFromBase10("15931493369629630809226283458085260090334794394361662678240713231519278691715")}


        GFp2 gamma13 = gFp2.exp(Fp256BN.p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2)));
        gamma13.print();
        // GFp2{x=50997318142241922852281555961173165965672272825141804376761836765206060036244, y=38665955945962842195025998234511023902832543644254935982879660597356748036009}
// xiToPMinus1Over2 is ξ^((p-1)/2) where ξ = i+3.
//var xiToPMinus1Over2 = &gfP2{bigFromBase10("50997318142241922852281555961173165965672272825141804376761836765206060036244"), bigFromBase10("38665955945962842195025998234511023902832543644254935982879660597356748036009")}

        GFp2 gamma14 = gFp2.exp(Fp256BN.p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(6)).multiply(BigInteger.valueOf(4)));
        gamma14.print();
        // GFp2{x=19885131339612776214803633203834694332692106372356013117629940868870585019582, y=21645619881471562101905880913352894726728173167203616652430647841922248593627}
        // xiTo2PMinus2Over3 is ξ^((2p-2)/3) where ξ = i+3.
//        var xiTo2PMinus2Over3 = &gfP2{bigFromBase10("19885131339612776214803633203834694332692106372356013117629940868870585019582"), bigFromBase10("21645619881471562101905880913352894726728173167203616652430647841922248593627")}

        GFp2 gamma15 = gFp2.exp(Fp256BN.p.subtract(BigInteger.ONE).divide(BigInteger.valueOf(6)).multiply(BigInteger.valueOf(5)));
        gamma15.print();
        // GFp2{x=1245143187432300088936752143608583630584766701540069380810616116854858284281, y=4638399546766722085016829746319127061133897159450628465163723049144537093234}
    }
}
