/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.SQLException;

/**
 *
 * @author Joan V. <sincorreo@gmail.com>
 */
public interface PersonaDao {
        public List<PersonaDTO> select()  throws SQLException;
        
        public insert (PersonaDTO persona) throws SQLException;
        
        public upate(PersonaDTO persona) throws SQLException;
        
        public delete(PersonaDTO persona) throws SQLException;
         
}
