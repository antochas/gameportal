/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iDAO;

import database.model.Games;
import java.util.List;

/**
 *
 * @author a
 */
public interface IHomeDAO {
    List<Games> fetchGamesFromFeatured();
}
