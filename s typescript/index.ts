function getTimestampsByDescription(xml, description) {
    //  Write your code here
    console.log(xml.split('>'))
    console.log(description)
  }

  var xmldate = 
  `<?xml version="1.0" encoding="UTF-8"?>
  <log>
    <event timestamp="1614285589">
      <description>Intrusion detected</description>
    </event>
    <event timestamp="1614286432">
      <description>Intrusion ended</description>
    </event>
  </log>`;

  var timestamps = getTimestampsByDescription(xmldate, "Intrusion ended");
  //console.log(timestamps == undefined ? timestamps : timestamps.join());

// !

function transformDateFormat(dates: string[]) {
    const reformat = dates.map(element => {
       const m =  element.replace(/\s/g, '').split('').map(element2 => {
            if ( parseInt(element2) === 0 || !isNaN(parseInt(element2))) {
                return element2
            } else {
                return "-"
            }
        }).join('')

        if(m.indexOf("-")>-1){
            return m.split('-').join('')
        }else{
            return  `${m.slice(0,4)}-${m.slice(4,6)}-${ m.slice(6,8)}`.split("-").join("")
        }
    });
    return reformat
}

const dates = transformDateFormat(["2010/02/20", "2 016p 19p 12", "11-18-2012", "2018 12 24", "20130720"]);
console.log(dates)




