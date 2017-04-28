Connection cn = null;
try {
  cn = AccesoDB.getConnection();
  
  
} catch (SQLException e) {
  throw new RuntimeException(e.getMessage());
} catch (Exception e) {
  throw new RuntimeException("Error en la consulta.");
} finally{
  try {
	cn.close();
  } catch (Exception e) {
  }
}