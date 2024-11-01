select murid.id, murid.name, max(pendidikan.id), pendidikan.status as pendidikan_terkahir, 
murid.time_create, pendidikan.time_create as time_update
from murid
join pendidikan on pendidikan.id_murid = murid.id
where pendidikan.id IN (SElect max(pendidikan.id) from pendidikan
group by pendidikan.id_murid
)
group by pendidikan.id_murid