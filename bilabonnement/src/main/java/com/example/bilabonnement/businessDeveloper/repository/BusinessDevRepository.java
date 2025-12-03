package com.example.bilabonnement.businessDeveloper.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class BusinessDevRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    //Vis antallet af rækker fra tabellen "status_histories" der har status "Rented"
    // OG hvor timestamp er højest(MAX)= nyest
    // = så den henter den nyeste status og at den skal være "Rented"

    public int getTotalRentedCars(){
        String sql = """
                SELECT COUNT(*) FROM status_histories sh 
                WHERE sh.timestamp = (
                    SELECT MAX(sh2.timestamp)
                    FROM status_histories sh2 
                    WHERE sh2.vehicle_id = sh.vehicle_id
                    ) 
                AND sh.status = 'RENTED'
                """;

        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        return result != null ? result : 0;

    }

    //Vis den summerede værdi af købsværdien (purchasePrice) fra cars tabellen
    //Slå sammen med status_histories tabellen, hvor vehicle_id er det samme
    //find og vis indholdet hvor status_histories timestamp er nyest (så der ikke findes nyere status'er)
    //OG har status RENTED
    public BigDecimal getTotalCarValueOfRentedCars(){
        String sql= """
                SELECT COALESCE(SUM(c.purchase_price), 0) 
                FROM cars c 
                JOIN status_histories sh ON sh.vehicle_id = c.vehicle_id
                WHERE sh.timestamp = (
                    SELECT MAX(sh2.timestamp)
                    FROM status_histories sh2
                    WHERE sh2.vehicle_id = c.vehicle_id
                )
                AND sh.status = 'RENTED'
        """;

        return jdbcTemplate.queryForObject(sql, BigDecimal.class);
    }

    //Vis antal returneringer for i dag:
    //tæl rækkerne fra lease_contract, forbind den til cars tabellen, hvor de har "vehicle_id" tilfælles
    //find hvor "end_date" fra lease_contract er lig med CURDATE() OG hvor lease_contracts "approved_date" ikkeer null
    //(og dermed registreret i det interne system) OG hvor car_status fra cars er sat til RENTED

    public int getTotalReturnsToday(){
        String sql = """
                SELECT COUNT(*) FROM lease_contracts 
                WHERE end_date = CURDATE() 
                AND approved_date IS NOT NULL 
                """;
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);

        return result != null ? result :0;
    }

    //Antal faktiske returneret biler i dag:
    //
    public int getActualReturnsToday(){
        String sql= """
                SELECT COUNT(*) 
                FROM status_histories sh 
                WHERE sh.status = 'RETURNED'
                AND DATE(sh.timestamp) = CURDATE()
                """;
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        return result != null ? result : 0;
    }

    //antal biler solgt i år:
    public int getCarsSoldThisYear(){
        String sql= "SELECT COUNT(*) FROM final_sales WHERE YEAR(sale_date)=YEAR(CURDATE())";

        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        return result != null ? result : 0;
    }


    //Tæl alle rækker fra status_histories hvor timestamp er nyest og status er ? (modtages fra service-laget)
    // Kan gebruges af alle med en "car_status" fra service-laget:
    public int getCarCountByStatus(String status){
        String sql = """
                SELECT COUNT(*) FROM status_histories sh 
                WHERE sh.timestamp = (
                    SELECT MAX(sh2.timestamp)
                    FROM status_histories sh2
                    WHERE sh2.vehicle_id = sh.vehicle_id
                )
                AND sh.status = ?
                """;
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class, status);
        return result != null ? result : 0;
    }




}
