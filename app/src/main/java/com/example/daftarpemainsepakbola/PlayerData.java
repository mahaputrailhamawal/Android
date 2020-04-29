package com.example.daftarpemainsepakbola;

import java.util.ArrayList;

public class PlayerData {
    private static String[] playerNames = {
            "Andrea Pirlo",
            "David Beckham",
            "Frenkie de Jong",
            "Johan Cruyff",
            "Jordan Henderson",
            "Josep Guardiola",
            "Paul Scholes",
            "Roy Keane",
            "Thomas Muller",
            "Zinedine Zidane"
    };

    private static String[] playerDetails = {
            "Andrea Pirlo (lahir di Flero, Lombardia, Italia, 19 Mei 1979; umur 40 tahun) adalah seorang mantan pemain sepak bola Italia yang pernah bermain untuk klub Ac Milan, Juventus, Inter Milan, New York City FC dan tim nasional Italia, ia berposisi sebagai gelandang.",
            "David Robert Joseph Beckham memulai karier profesional bersama Manchester United, mendapat kesempatan debut di tim utama pada 1992, saat usianya masih 17 tahun. Bersama United, Beckham memenangi enam gelar Liga Utama Inggris, dua Piala FA dan Liga Champions UEFA pada 1999. Dia kemudian bermain empat musim untuk Real Madrid, memenangi gelar juara La Liga di musim terakhirnya bersama raksasa Spanyol tersebut. Pada Juli 2007, Beckham menandatangani kontrak lima tahun bersama klub Major League Soccer, Los Angeles Galaxy. Ketika berseragam Galaxy, ia menghabiskan dua masa peminjaman ke Italia bersama Milan pada 2009 dan 2010.",
            "Frenkie de Jong (lahir 12 Mei 1997) adalah seorang pemain sepakbola profesional Belanda yang bermain sebagai gelandang untuk klub Spanyol Barcelona dan Timnas Belanda.",
            "Hendrik Johannes Cruijff (Belanda: [ˈjoːɦɑn ˈkrœy̆f]; lahir di Amsterdam, Belanda, 25 April 1947 – meninggal di Barcelona, 24 Maret 2016 pada umur 68 tahun) adalah mantan pemain dan pelatih sepak bola Belanda. Selain bermain untuk Ajax dan Barcelona, ia juga menjadi bagian dari tim nasional sepak bola Belanda yang menjadi juara kedua Piala Dunia 1974. Johan meninggal dunia pada tanggal 24 Maret 2016.",
            "Jordan Brian Henderson (lahir di Sunderland, Tyne and Wear, Inggris, 17 Juni 1990; umur 29 tahun) merupakan seorang pemain sepak bola Inggris. Ia berposisi sebagai gelandang. Saat ini ia menjadi kapten dalam tim Liverpool dan untuk tim nasional Inggris.",
            "Josep \"Pep\" Guardiola i Sala (lahir di Santpedor, Barcelona, Catalunya, Spanyol, 18 Januari 1971; umur 49 tahun) merupakan seorang mantan pemain sepak bola Spanyol, yang sejak 2016 melatih Manchester City. Ia dahulu berposisi sebagai gelandang bertahan. Ia melatih Barcelona sejak 2008 hingga Juni 2012 dan mulai awal musim 2013–14 menjadi pelatih FC Bayern München. Ia juga pernah bermain untuk tim nasional Spanyol dan tim nasional Catalunya.",
            "Paul Scholes (lahir 16 November 1974; umur 45 tahun) adalah mantan pemain sepak bola dari Inggris yang menghabiskan semua kariernya bermain untuk klub Manchester United. Ia memulai Karier debutnya pada musim 1994-95 dan menjadi Pemain kunci ketika United memenangkan Treble Winners pada musim 1998-99.",
            "Roy Maurice Keane (lahir 10 Agustus 1971 di Mayfield, Cork, Irlandia) adalah mantan pemain sepak bola profesional dan saat ini merupakan assisten dari tim nasional Republik Irlandia. Seorang sentral dominan-gelandang, Keane disebut-sebut sebagai salah satu pemain terbaik di eranya. Dengan kesuksesannya 17 tahun berkarier, di bermain untuk Cobh Ramblers di Irlandia, Nottingham Forest dan Manchester United, sebelum mengakhiri kariernya sebagai pemain sepak bola di Celtic F.C. tim Skotlandia.",
            "Thomas Müller (pengucapan bahasa Jerman: [ˈtoːmas ˈmʏlɐ]) (lahir di Weilheim, Jerman Barat, 13 September 1989; umur 30 tahun) adalah pemain sepak bola asal Jerman yang bermain dan menjadi wakil kapten untuk Bayern München dan tim nasional Jerman. Sebagai pemain yang serba guna, Müller bermain sebagai gelandang atau penyerang, dan telah bermain dalam berbagai posisi menyerang – gelandang serang, penyerang bayangan, penyerang tengah, serta pemain sayap. Dia dipuji karena pengaturan posisi, kerja tim dan stamina, tingkat produktivitas, serta konsistensi dalam mencetak dan menciptakan gol.",
            "Zinédine Yazid Zidane yang terkenal dan populer dengan panggilan Zizou adalah seorang mantan pemain sepak bola Prancis keturunan Aljazair. Posisinya adalah gelandang menyerang. Memulai karier sebagai pemain di klub AS Cannes, ia kemudian bermain di Bordeaux, Juventus dan terakhir Real Madrid."
    };

    private static int[] playerImages = {
            R.drawable.andrea_pirlo,
            R.drawable.david_beckham,
            R.drawable.frenkie_de_jong,
            R.drawable.johan_cruijff,
            R.drawable.jordan_henderson,
            R.drawable.josep_guardiola,
            R.drawable.paul_scholes,
            R.drawable.roy_keane,
            R.drawable.thomas_muller,
            R.drawable.zinedine_zidane
    };

    public static ArrayList<Player> getListData() {
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playerNames.length; position++) {
            Player player = new Player();
            player.setName(playerNames[position]);
            player.setDetail(playerDetails[position]);
            player.setPhoto(playerImages[position]);
            list.add(player);
        }
        return list;
    }
}