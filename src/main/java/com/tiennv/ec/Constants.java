package com.tiennv.ec;

import java.math.BigInteger;

public class Constants {
    public static final BigInteger TWO = BigInteger.valueOf(2);
    public static final BigInteger THREE = BigInteger.valueOf(3);
    public static final BigInteger FOUR = BigInteger.valueOf(4);
    public static final BigInteger EIGHT = BigInteger.valueOf(8);

    public static final BigInteger SIX = BigInteger.valueOf(6);
    public static final BigInteger TWO_FOUR = BigInteger.valueOf(24);
    public static final BigInteger THREE_SIX = BigInteger.valueOf(36);

    public static final GFp2 XI = new GFp2(new GFp(BigInteger.ONE), new GFp(THREE));

    public static final GFp2 TWIST_B = new GFp2(new GFp(new BigInteger("6500054969564660373279643874235990574282535810762300357187714502686418407178")), new GFp(new BigInteger("45500384786952622612957507119651934019977750675336102500314001518804928850249")));

    public static final GFp2 XI_P_Minus1_Over2 = new GFp2(new GFp(new BigInteger("50997318142241922852281555961173165965672272825141804376761836765206060036244")), new GFp(new BigInteger("38665955945962842195025998234511023902832543644254935982879660597356748036009")));

    public static final GFp2 XI_P_Minus1_Over3 = new GFp2(new GFp(new BigInteger("26098034838977895781559542626833399156321265654106457577426020397262786167059")), new GFp(new BigInteger("15931493369629630809226283458085260090334794394361662678240713231519278691715")));

    public static final GFp2 XI_P_Minus1_Over6 = new GFp2(new GFp(new BigInteger("8669379979083712429711189836753509758585994370025260553045152614783263110636")), new GFp(new BigInteger("19998038925833620163537568958541907098007303196759855091367510456613536016040")));

    public static final GFp2 XI_2P_Minus2_Over3 = new GFp2(new GFp(new BigInteger("19885131339612776214803633203834694332692106372356013117629940868870585019582")), new GFp(new BigInteger("21645619881471562101905880913352894726728173167203616652430647841922248593627")));

    public static final BigInteger XI_PSquared_Minus1_Over3 = new BigInteger("65000549695646603727810655408050771481677621702948236658134783353303381437752");

    public static final BigInteger XI_2PSquared_Minus2_Over3 = new BigInteger("4985783334309134261147736404674766913742361673560802634030");

    public static final BigInteger XI_2PSquared_Minus1_Over6 = new BigInteger("65000549695646603727810655408050771481677621702948236658134783353303381437753");


//    public static final GFp2 gamma12 = new GFp2(new GFp(new BigInteger("26098034838977895781559542626833399156321265654106457577426020397262786167059")),
//            new GFp(new BigInteger("15931493369629630809226283458085260090334794394361662678240713231519278691715")));

//    public static final GFp2 gamma13 = new GFp2(new GFp(new BigInteger("50997318142241922852281555961173165965672272825141804376761836765206060036244")),
//            new GFp(new BigInteger("38665955945962842195025998234511023902832543644254935982879660597356748036009")));

}