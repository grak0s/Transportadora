select t1.placa, t5.tipo_nit ,t5.no_nit , t5.nombres , t3.nombres from vehiculos as t1
inner join cond_veh as t2
on t1.id = t2.veh_id
inner join conductores as t3
on t2.con_id = t3.id 
inner join emp_veh as t4
on t1.id  = t4.veh_id 
inner join empresas as t5
on t4.emp_id = t5.id 