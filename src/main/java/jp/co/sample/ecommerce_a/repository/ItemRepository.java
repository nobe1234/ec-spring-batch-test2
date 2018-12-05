package jp.co.sample.ecommerce_a.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import jp.co.sample.ecommerce_a.domain.Item;

/**
 * Itemテーブルを操作するリポジトリ.
 * 
 * @author yu.terauchi
 *
 */
public class ItemRepository {

	/**
	 *ResultSetオブジェクトからItemオブジェクトに変換するためのクラス実装&インスタンス化 
	 */
	private static final RowMapper<Item> Item_ROW_MAPPER = (rs, i) -> {
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setDescription(rs.getString("description"));
		item.setPriceM(rs.getInt("price_m"));
		item.setPriceL(rs.getInt("price_l"));
		item.setImagePath(rs.getString("image_path"));
		item.setDeleted(rs.getBoolean("deleted"));
		return item;
	};
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public List<Item> findAll() {
		List<Item> items = jdbcTemplate.query(
				"SELECT id,name,description,price_m,price_l,image_path,deleted FROM items ORDER BY name ASC;", 
				Item_ROW_MAPPER);
		return items;
	}
	
}
