package module02.problem03;

public class Main {
    public static void main(String[] args) {
        /*
        TODO: Tambahkan komentar berupa penyebab eror/bug dengan format sbb.:

            //Pada baris ini terjadi error karena kurangnya titik koma (;)
            //public String name
            public String name;

            Baris 1: Penyebab
            Baris 2: Kode sebelumnya
            Baris 3: Kode yang sudah diperbaiki

        TODO: Jangan lupa hapus keseluruhan TODO ini
         */
        Employee e = new Employee();
        e.name = "Roi"
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");

        System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age);
    }
}
